import jdk.jshell.JShell;
import jdk.net.NetworkPermission;

import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        var x=URLEncoder.encode("https://www.urlencoder.org/","UTF-8");
        System.out.println("url: https://www.urlencoder.org/");
        System.out.println("url encode: "+x);


        String tt=Base64.getEncoder().encodeToString(x.getBytes(StandardCharsets.UTF_8));
        System.out.println("base64: "+tt);

        var d=Base64.getDecoder().decode(tt.getBytes(StandardCharsets.UTF_8));

        String g="";
        for(var l:d) {
            g+=(char)l;
        }
        System.out.println("url encode: "+g);
        var e=URLDecoder.decode(g,"UTF-8");
        System.out.println("url: "+e);
    }
}