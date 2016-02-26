package test2;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class test2 {

    public static void main(String[] args) throws IOException {

        // We need run initial request to obtain RequestVerificationToken
        String initialURL = "https://www.skanetrafiken.se/inloggning/LoginPost/";
        Document doc = Jsoup
                .connect(initialURL)
                .get();

        String requestVerificationToken = doc.select("input[name=__RequestVerificationToken]").get(0).val();

        // Do login (all headers and more  important all  form fields should be populated)
        String loginURL = "https://www.skanetrafiken.se/inloggning?ReturnUrl=%2fmitt-konto%2fse-saldo-och-ladda-kort%2f";
        Response res = Jsoup.connect(loginURL)
                .header("Accept", "*/*")
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Origin", "https://www.skanetrafiken.se")
                .header("X-Requested-With", "XMLHttpRequest")
                .header("Referer", "https://www.skanetrafiken.se/inloggning")
                .data("__RequestVerificationToken", requestVerificationToken)
                .data("loginInputModel.ReturnUrl", "")
                .data("loginInputModel.Role", "Private")
                .data("loginInputModel.Email", "<email>")
                .data("loginInputModel.Password", "<password>")
                .data("X-Requested-With", "XMLHttpRequest")
                .userAgent("Mozilla/5.0")
                .ignoreContentType(true)
                .method(Method.POST)
                .execute();

        // Keep logged in (store cookies for next calls)
        Map<String, String> cookies = res.cookies();

        // Request a desired page
        String accountURL = "https://www.skanetrafiken.se/mitt-konto/se-saldo-och-ladda-kort/";
        Document doc2 = Jsoup
                .connect(accountURL)
                .cookies(cookies)
                .get();

        // Work with the doc
        System.out.println(doc2);
    }
}