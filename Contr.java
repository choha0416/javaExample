package pro.test;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/json3")
public class Contr extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Contr() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");

        // 클라이언트로부터 JSON 데이터를 읽기
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        String jsonData = sb.toString();  // JSON 데이터 문자열

        // JSON 문자열을 JSONObject로 파싱
        JSONObject jsonObject1 = new JSONObject(jsonData);
        
        JSONObject jsonObject = new JSONObject();

        // 각 필드를 하나하나 추출하여 출력
        String id = jsonObject.getString("id");
        String pw = jsonObject.getString("pw");
        String name = jsonObject.getString("name");
        String age = jsonObject.getString("age");

        // 콘솔에 출력
        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        // JSON 응답 생성
        String responseMessage = "{\"message\":\"회원가입이 성공적으로 처리되었습니다.\"}";

        // JSON 응답 보내기
        PrintWriter writer = response.getWriter();
        writer.write(responseMessage);
        writer.flush();
    }
}
