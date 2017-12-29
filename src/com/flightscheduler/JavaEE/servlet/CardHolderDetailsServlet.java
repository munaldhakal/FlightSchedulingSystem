package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.SaveCardHolderDetails;
import com.flightscheduler.JavaEE.dto.CardHolderDetailsDto;
import com.flightscheduler.JavaEE.model.CardHolderDetails;

/**
 * Servlet implementation class CardHolderDetailsServlet
 */
@WebServlet("/CardHolderDetailsServlet")
public class CardHolderDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardHolderDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	CardHolderDetailsDto cardHolderDetailsDto = new CardHolderDetailsDto();
	cardHolderDetailsDto.setDocumentId(Long.parseLong(request.getParameter("documentId")));
	cardHolderDetailsDto.setId(Long.parseLong(request.getParameter("id")));
	cardHolderDetailsDto.setChFirstName(request.getParameter("chFirstName"));
	cardHolderDetailsDto.setChMiddleName(request.getParameter("chMiddleName"));
	cardHolderDetailsDto.setChLastName(request.getParameter("chLastName"));
	cardHolderDetailsDto.setPhoneNumber(Long.parseLong(request.getParameter("phoneNumber")));
	cardHolderDetailsDto.setEmailAddress(request.getParameter("emailAddress"));
	cardHolderDetailsDto.setPid(Long.parseLong(request.getParameter("pid")));
	cardHolderDetailsDto.setFid(Long.parseLong(request.getParameter("fid")));
	CardHolderDetails cardHolderDetails = new CardHolderDetails();
	cardHolderDetails.setId(cardHolderDetailsDto.getId());
	cardHolderDetails.setChFirstName(cardHolderDetailsDto.getChFirstName());
	cardHolderDetails.setChMiddleName(cardHolderDetailsDto.getChMiddleName());
	cardHolderDetails.setChLastName(cardHolderDetailsDto.getChLastName());
	cardHolderDetails.setPhoneNumber(cardHolderDetailsDto.getPhoneNumber());
	cardHolderDetails.setEmailAddress(cardHolderDetailsDto.getEmailAddress());
	cardHolderDetails.setDocumentId(cardHolderDetailsDto.getDocumentId());
	cardHolderDetails.setPid(cardHolderDetailsDto.getPid());
	cardHolderDetails.setFid(cardHolderDetailsDto.getFid());
	SaveCardHolderDetails.saveCardHolderDetails(cardHolderDetails);
	}
}
