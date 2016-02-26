import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Base64;

public class testConnection {

	public static void main(String[] args) throws Exception {
		String loginURL = "https://www.skanetrafiken.se/inloggning/LoginPost/?ReturnUrl=%2fmitt-konto%2fse-s%E2%80%8C%E2%80%8Baldo-och-ladda-kort%2f"; // URL of the login page
		String accountURL = "https://www.skanetrafiken.se/mitt-konto/se-saldo-och-ladda-kort/"; // The URL you get to after successfully logging in
		String username = "email@email.com";
		String password = "password";
		String login = username + ":" + password;
		
		String base64login = new String(Base64.getEncoder().encode(login.getBytes()));
		
		Document res = Jsoup
				.connect(loginURL)
				.data("loginInputModel_Email", "myEmail@email.com") //Not sure if these are the correct values to be changed or if this even changes them
				.data("loginInputModel_Password", "myPassword")
				.post();
		
		System.out.println(res); // What should be printed to check to see if it worked?
	}
}
