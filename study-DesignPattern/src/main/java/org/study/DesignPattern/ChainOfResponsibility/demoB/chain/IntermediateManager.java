package org.study.DesignPattern.ChainOfResponsibility.demoB.chain;

import org.study.DesignPattern.ChainOfResponsibility.demoB.Manager;
import org.study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import org.study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

/**
 * 中级管理者
 * 
 * @author user
 *
 */
public class IntermediateManager extends Manager {

	@Override
	public Response handleRequest(Request request) {
		if ("请假".equals(request.getRequestType()) && request.getDays() <= 5) {
			String msg = request.getName() + "请假时长：" + request.getDays() + "天,被中级管理员批准";
			return new Response(msg);
		} else {
			if (superior != null) {
				return superior.handleRequest(request);
			}
		}
		return new Response("");
	}

}
