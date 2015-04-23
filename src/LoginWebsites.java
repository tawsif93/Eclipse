import java.net.*;
import java.io.*;

public class LoginWebsites
{
    private static final String POST_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String LOGIN_ACTION_NAME = "Login";
    private static final String LOGIN_USER_NAME_PARAMETER_NAME = "email";
    private static final String LOGIN_PASSWORD_PARAMETER_NAME = "pass";

    private static final String LOGIN_USER_NAME = "cxxxxxx@gmail.com";
    private static final String LOGIN_PASSWORD = "xxxxxxa@2102";





    /**
     * The single public method of this class that
     * 1. Prepares a login message
     * 2. Makes the HTTP POST to the target URL
     * 3. Reads and returns the response
     *
     * @throws IOException
     * Any problems while doing the above.
     *
     */
    public String httpPostLogin (String TARGET_URL)
    { 
        String response="";
        try
        {
            // Prepare the content to be written
            // throws UnsupportedEncodingException
            String urlEncodedContent = preparePostContent(LOGIN_USER_NAME, LOGIN_PASSWORD);

            HttpURLConnection urlConnection = doHttpPost(TARGET_URL, urlEncodedContent);

             response = readResponse(urlConnection);





        }
        catch(IOException ioException)
        {
            System.out.println("Problems encounterd.");
        }
        return response;
    }

    /**
     * Using the given username and password, and using the static string variables, prepare
     * the login message. Note that the username and password will encoded to the
     * UTF-8 standard.
     *
     * @param loginUserName
     * The user name for login
     *
     * @param loginPassword
     * The password for login
     *
     * @return
     * The complete login message that can be HTTP Posted
     *
     * @throws UnsupportedEncodingException
     * Any problems during URL encoding
     */
    private String preparePostContent(String loginUserName, String loginPassword) throws UnsupportedEncodingException
    {
        // Encode the user name and password to UTF-8 encoding standard
        // throws UnsupportedEncodingException
        String encodedLoginUserName = URLEncoder.encode(loginUserName, "UTF-8");
        String encodedLoginPassword = URLEncoder.encode(loginPassword, "UTF-8");

        String content = "login=" + LOGIN_ACTION_NAME +" &" + LOGIN_USER_NAME_PARAMETER_NAME +"="
        + encodedLoginUserName + "&" + LOGIN_PASSWORD_PARAMETER_NAME + "=" + encodedLoginPassword;

        return content;

    }

    /**
     * Makes a HTTP POST to the target URL by using an HttpURLConnection.
     *
     * @param targetUrl
     * The URL to which the HTTP POST is made.
     *
     * @param content
     * The contents which will be POSTed to the target URL.
     *
     * @return
     * The open URLConnection which can be used to read any response.
     *
     * @throws IOException
     */
    public HttpURLConnection doHttpPost(String targetUrl, String content) throws IOException
    {
        HttpURLConnection urlConnection = null;
        DataOutputStream dataOutputStream = null;
        try
        {
            // Open a connection to the target URL
            // throws IOException
            urlConnection = (HttpURLConnection)(new URL(targetUrl).openConnection());

            // Specifying that we intend to use this connection for input
            urlConnection.setDoInput(true);

            // Specifying that we intend to use this connection for output
            urlConnection.setDoOutput(true);

            // Specifying the content type of our post
            urlConnection.setRequestProperty("Content-Type", POST_CONTENT_TYPE);

            // Specifying the method of HTTP request which is POST
            // throws ProtocolException
            urlConnection.setRequestMethod("POST");

            // Prepare an output stream for writing data to the HTTP connection
            // throws IOException
            dataOutputStream = new DataOutputStream(urlConnection.getOutputStream());

            // throws IOException
            dataOutputStream.writeBytes(content);
            dataOutputStream.flush();
            dataOutputStream.close();

            return urlConnection;
        }
        catch(IOException ioException)
        {
            System.out.println("I/O problems while trying to do a HTTP post.");
            ioException.printStackTrace();

            // Good practice: clean up the connections and streams
            // to free up any resources if possible
            if (dataOutputStream != null)
            {
                try
                {
                    dataOutputStream.close();
                }
                catch(Throwable ignore)
                {
                    // Cannot do anything about problems while
                    // trying to clean up. Just ignore
                }
            }
            if (urlConnection != null)
            {
                urlConnection.disconnect();
            }

            // throw the exception so that the caller is aware that
            // there was some problems
            throw ioException;
        }
    }

    /**
     * Read response from the URL connection
     *
     * @param urlConnection
     * The URLConncetion from which the response will be read
     *
     * @return
     * The response read from the URLConnection
     *
     * @throws IOException
     * When problems encountered during reading the response from the
     * URLConnection.
     */
    private String readResponse(HttpURLConnection urlConnection) throws IOException
    {

        BufferedReader bufferedReader = null;
        try
        {
            // Prepare a reader to read the response from the URLConnection
            // throws IOException
            bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String responeLine;

            // Good Practice: Use StringBuilder in this case
            StringBuilder response = new StringBuilder();

            // Read untill there is nothing left in the stream
            // throws IOException
            while ((responeLine = bufferedReader.readLine()) != null)
            {
                response.append(responeLine);
            }

            return response.toString();
        }
        catch(IOException ioException)
        {
            System.out.println("Problems while reading the response");
            ioException.printStackTrace();

            // throw the exception so that the caller is aware that
            // there was some problems
            throw ioException;

        }
        finally
        {
            // Good practice: clean up the connections and streams
            // to free up any resources if possible
            if (bufferedReader != null)
            {
                try
                {
                    // throws IOException
                    bufferedReader.close();
                }
                catch(Throwable ignore)
                {
                    // Cannot do much with exceptions doing clean up
                    // Ignoring all exceptions
                }
            }

        }
    }
    
    


public static void main(String[] args) throws Exception {
    URL url = new URL("http://www.cplusplus.com/");
    URLConnection yc = url.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(yc
            .getInputStream()));
    String inputLine;
    String allInput = "";

    while ((inputLine = in.readLine()) != null) {

        allInput += inputLine + "\r\n";
    }
    System.out.println(allInput);

    in.close();
}


}