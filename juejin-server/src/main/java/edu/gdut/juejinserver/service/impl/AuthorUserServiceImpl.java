package edu.gdut.juejinserver.service.impl;

import edu.gdut.juejinserver.pojo.AuthorUser;
import edu.gdut.juejinserver.mapper.AuthorUserMapper;
import edu.gdut.juejinserver.service.AuthorUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AuthorUserServiceImpl extends ServiceImpl<AuthorUserMapper, AuthorUser> implements AuthorUserService {

}
