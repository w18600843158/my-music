package com.mymusic.wxw.service.impl;


import com.mymusic.wxw.dao.SingerMapper;
import com.mymusic.wxw.model.Singer;
import com.mymusic.wxw.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    public boolean updateSingerMsg(Singer singer) {
        return singerMapper.updateSingerMsg(singer) >0 ?true:false;
    }

    public boolean updateSingerPic(Singer singer) {

        return singerMapper.updateSingerPic(singer) >0 ?true:false;
    }

    public boolean deleteSinger(Integer id) {
        return singerMapper.deleteSinger(id) >0 ?true:false;
    }

    public List<Singer> allSinger()
    {
        return singerMapper.allSinger();
    }

    public boolean addSinger(Singer singer)  {

        return singerMapper.insertSelective(singer) > 0 ? true : false;
    }

    public List<Singer> singerOfName(String name)

    {
        return singerMapper.singerOfName(name);
    }

    public List<Singer> singerOfSex(Integer sex)

    {
        return singerMapper.singerOfSex(sex);
    }
}
