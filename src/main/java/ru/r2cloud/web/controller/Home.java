package ru.r2cloud.web.controller;

import ru.r2cloud.web.HttpContoller;
import ru.r2cloud.web.ModelAndView;
import fi.iki.elonen.NanoHTTPD.IHTTPSession;

public class Home implements HttpContoller {

	@Override
	public ModelAndView httpGet(IHTTPSession session) {
		ModelAndView result = new ModelAndView("index");
		return result;
	}

	@Override
	public String getRequestMappingURL() {
		return "/";
	}

}
