package com.jacks.research;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.jacks.research.controller.MyUserController;

public class ResearchApplicationTests {
	
	@InjectMocks
    private MyUserController controller;
	
	private MockMvc mockMvc;

	@org.junit.Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	

	@Test
	public void findByTargetProjectTest() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/suiteInformationses/search/findByTargetProject?url=xyz").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse().getStatus());
	}

}
