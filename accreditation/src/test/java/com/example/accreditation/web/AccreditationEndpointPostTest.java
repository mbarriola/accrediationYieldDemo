package com.example.accreditation.web;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.yieldstreet.web.WebAccreditationController;
import com.example.yieldstreet.web.WebServer;

/*
@ExtendWith(SpringExtension.class)
@WebAppConfiguration()
@ContextConfiguration(classes = { WebServer.class })
@TestInstance(Lifecycle.PER_CLASS)
@TestPropertySource(locations = "classpath:web-server.properties")
@WebMvcTest(WebAccreditationController.class)
public class AccreditationEndpointPostTest {

	@Autowired
	private MockMvc mockMvc;
	private String postMsg = "{\r\n" + "  \"user_id\": \"g8NlYJnk7zK9BlB1J2Ebjs0AkhCTpE1V\",\r\n"
			+ "  \"payload\": {\r\n" + "    \"accreditation_type\": \"BY_INCOME\",\r\n" + "    \"documents\": [{\r\n"
			+ "        \"name\": \"2018.pdf\",\r\n" + "        \"mime_type\": \"application/pdf\",\r\n"
			+ "        \"content\": \"ICAiQC8qIjogWyJzcmMvKiJdCiAgICB9CiAgfQp9Cg==\"\r\n" + "      },{\r\n"
			+ "        \"name\": \"2019.jpg\",\r\n" + "        \"mime_type\": \"image/jpeg\",\r\n"
			+ "        \"content\": \"91cy1wcm9taXNlICJeMi4wLjUiCiAgICB0b3Bvc29ydCAiXjIuMC4yIgo=\"\r\n" + "      }\r\n"
			+ "    ]\r\n" + "  }\r\n" + "}";

	@Test
	public void testPostJsonRequest() throws Exception {
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.post("/user/accreditation").content(postMsg)
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();

		String resultDOW = result.getResponse().getContentAsString();
		assertNotNull(resultDOW);
	}
}*/
