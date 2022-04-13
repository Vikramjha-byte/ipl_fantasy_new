package com.ipl_fantasy.utils;

import java.util.ArrayList;
import java.util.List;

import com.ipl_fantasy.dto.UserDTO;
import com.ipl_fantasy.entities.UserEntity;



public class UserUtils {

	public static List<UserDTO> convertToUserDtoList(List<UserEntity> list){
		List<UserDTO> dtolist = new ArrayList<UserDTO>();
		for(UserEntity userentity:list) {
			dtolist.add(convertToUserDto(userentity));
		}
		return dtolist;
	}

	public static UserDTO convertToUserDto(UserEntity userentity) {
		UserDTO userdto = new UserDTO();
		userdto.setId(userentity.getId());
		userdto.setName(userentity.getName());
		userdto.setEmail(userentity.getEmail());
		userdto.setPassword(userentity.getPassword());
		userdto.setUsername(userentity.getUsername());
		userdto.setMobile_number(userentity.getMobile_number());
		userdto.setRole(userentity.getRole());
		return userdto;
	}
	
	public static UserEntity convertTouserEntity(UserDTO userdto) {
		UserEntity userentity = new UserEntity();
		userentity.setEmail(userdto.getEmail());
		userentity.setPassword(userdto.getPassword());
		userentity.setMobile_number(userdto.getMobile_number());
		userentity.setName(userdto.getName());
		userentity.setName(userdto.getName());
		userentity.setUsername(userdto.getUsername());
		userentity.setRole(userdto.getRole());
		return userentity;
	}
}
