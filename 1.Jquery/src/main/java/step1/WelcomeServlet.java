package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet { // 실제 예를 들기 위해 WelcomeServlet이라는 클래스를 
	// HttpServlet 인터페이스를 받아서 구현을 합니다.
	private static final long serialVersionUID = 1L; // serialVersionUID 가 선언되어있지 않을 경우 default로 값을 만들어준다
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8"); //문자열 형태의 type에 지정된 MIME Type으로 Content Type을 지정한다.
		request.setCharacterEncoding("utf-8"); // 현재 JSP로 전달되는 내용을 지정한 캐리터셋을로 변환해 준다. 
		// HTML 폼에서 한글을 입력할 때 정상적으로 처리하려면 반드시 필요하다.
		// 응답시 문서타입과 한글처리
		response.setContentType("text/html;charset=utf-8"); //문자열 형태의 type에 지정된 MIME Type으로 Content Type을 지정한다.
		PrintWriter out = response.getWriter();
		out.println("post 방식으로 요청했군요!!!");
		//클라이언트의 요청 정보에서 아이디를 얻어온다.
		out.println(request.getParameter("uname"));
		out.close();
	}

}
