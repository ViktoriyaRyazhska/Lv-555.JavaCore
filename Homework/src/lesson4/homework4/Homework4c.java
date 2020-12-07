package lesson4.homework4;

//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework4c {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of HTTP Error: ");
        int errorNumber = Integer.parseInt(reader.readLine());

        switch (errorNumber){
            case 400:
                System.out.println(HTTPError.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HTTPError.UNAUTHORIZED);
                break;
            case 403:
                System.out.println(HTTPError.FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPError.NOT_FOUND);
                break;
            case 502:
                System.out.println(HTTPError.BAD_GATEWAY);
                break;
            case 504:
                System.out.println(HTTPError.GATEWAY_TIMEOUT);
                break;
        }
    }

    public enum  HTTPError{
       BAD_REQUEST, UNAUTHORIZED, FORBIDDEN, NOT_FOUND, BAD_GATEWAY, GATEWAY_TIMEOUT;

    }
}
