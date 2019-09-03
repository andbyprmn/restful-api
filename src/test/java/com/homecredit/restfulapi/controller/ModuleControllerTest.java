package com.homecredit.restfulapi.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.homecredit.restfulapi.model.Modules;
import com.homecredit.restfulapi.repository.ModuleRepository;
import com.homecredit.restfulapi.service.ModuleService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ModuleController.class)
public class ModuleControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ModuleService moduleService;
	
	private final String URL = "/api/module/";
	
	@Test
	public void testGetModuleById() throws Exception {
		Modules mockModule1 = new Modules();
		mockModule1.setId_modules(22);
		mockModule1.setModule_name("Main Menu");
		mockModule1.setId_user(290819004);
		
		Modules mockModule2 = new Modules();
		mockModule2.setId_modules(23);
		mockModule2.setModule_name("Chart");
		mockModule2.setId_user(290819005);
		
		List<Modules> moduleList = new ArrayList<>();
		moduleList.add(mockModule1);
		moduleList.add(mockModule2);
		
		Mockito.when(moduleService.getAllModules()).thenReturn(moduleList);
		
		String URI = URL+"290819001";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				URI).accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		String expectedJson = this.mapToJson(moduleList);
		String outputInJson = result.getResponse().getContentAsString();
		assertThat(outputInJson).isEqualTo(expectedJson);
	}

	/**
	 * Maps an Object into a JSON String. Uses a Jackson ObjectMapper.
	 */
	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

}
