package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet4
 */
@WebServlet("/WelcomeServlet4")
public class WelcomeServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }
    private HashMap<String,String> nickMap=new HashMap<String,String>();
   
    public void init() throws ServletException {
		nickMap.put("��¼�","��ڻ�");
		nickMap.put("�忩��", "������Ż");
		nickMap.put("���ؿ�", "�����÷���");
		nickMap.put("������", "ȸ��ŷ");
	}
    
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		//�κ� ������Ʈ�� ���� ĳ��(�ӽø޸𸮿���)��� ����
		//response.setHeader("Cache-Control", "no-cache");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
	
		boolean flag=nickMap.containsKey(name);
		if(flag){
			out.println(name+"���� ������ "+nickMap.get(name));
		}else{
			out.println(" �����Ǵ� ������ ����");
		}
		out.println("");
		out.println("�������� ������");
		out.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
