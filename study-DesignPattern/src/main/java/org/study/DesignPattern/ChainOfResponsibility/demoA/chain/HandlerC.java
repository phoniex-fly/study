package org.study.DesignPattern.ChainOfResponsibility.demoA.chain;

import org.study.DesignPattern.ChainOfResponsibility.demoA.Handler;
import org.study.DesignPattern.ChainOfResponsibility.demoB.dto.Request;
import org.study.DesignPattern.ChainOfResponsibility.demoB.dto.Response;

public class HandlerC extends Handler {

	@Override
	public int handleLevel() {
		return 7;
	}

	@Override
	public Response handle(Request request) {
		if (request.getDays() == this.handleLevel()) {
			return new Response("处理人C处理完成");
		}
		return new Response("error C");
	}

}
