package com.org.elk.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.elk.pojo.User;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/elk")
@Log4j2
public class ElkStackExampleController
{
	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable int id)
	{
		List<User> users = getUsers();
		User user = users.stream().filter(u -> u.getId() == id).findAny().orElse(null);
		if(user != null)
		{
			log.info("user found : {}", user);
			return user;
		}
		else
		{
			try
			{
				throw new Exception();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				log.error("User Not Found with ID : {}", id);
			}
			return new User();
		}
	}

	private List<User> getUsers()
	{
		return Stream.of(new User(1, "John"),
				new User(2, "Shyam"),
				new User(3, "Rony"),
				new User(4, "mak"))
				.collect(Collectors.toList());
	}

}
