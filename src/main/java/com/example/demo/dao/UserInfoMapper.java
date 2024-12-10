package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.UserInfo;

//ユーザー情報 Mapper
@Mapper
public interface UserInfoMapper {

    //ユーザー情報全件検索
    List<UserInfo> findAll();

    //ユーザー情報主キー検索
    UserInfo findById(Long id);

    //ユーザー情報検索
    List<UserInfo> search(UserSearchRequest user);

    //ユーザー情報登録
    void save(UserAddRequest userRequest);

    //ユーザー情報更新
    void update(UserUpdateRequest userUpdateRequest);

    //ユーザー情報の論理削除
    void delete(Long id);
}