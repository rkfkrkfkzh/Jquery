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
public class WelcomeServlet extends HttpServlet { // ���� ���� ��� ���� WelcomeServlet�̶�� Ŭ������ 
	// HttpServlet �������̽��� �޾Ƽ� ������ �մϴ�.
	private static final long serialVersionUID = 1L; // serialVersionUID �� ����Ǿ����� ���� ��� default�� ���� ������ش�
       
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
		response.setContentType("text/html;charset=utf-8"); //���ڿ� ������ type�� ������ MIME Type���� Content Type�� �����Ѵ�.
		request.setCharacterEncoding("utf-8"); // ���� JSP�� ���޵Ǵ� ������ ������ ĳ���ͼ����� ��ȯ�� �ش�. 
		// HTML ������ �ѱ��� �Է��� �� ���������� ó���Ϸ��� �ݵ�� �ʿ��ϴ�.
		// ����� ����Ÿ�԰� �ѱ�ó��
		response.setContentType("text/html;charset=utf-8"); //���ڿ� ������ type�� ������ MIME Type���� Content Type�� �����Ѵ�.
		PrintWriter out = response.getWriter();
		out.println("post ������� ��û�߱���!!!");
		//Ŭ���̾�Ʈ�� ��û �������� ���̵� ���´�.
		out.println(request.getParameter("uname"));
		out.close();
	}

}
