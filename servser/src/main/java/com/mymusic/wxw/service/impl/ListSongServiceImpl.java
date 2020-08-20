package com.mymusic.wxw.service.impl;


import com.mymusic.wxw.dao.ListSongMapper;
import com.mymusic.wxw.model.ListSong;
import com.mymusic.wxw.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListSongServiceImpl implements ListSongService {

    @Autowired
    private ListSongMapper listSongMapper;

    public List<ListSong> allListSong()
    {
        return listSongMapper.allListSong();
    }

    public boolean updateListSongMsg(ListSong listSong) {
        return listSongMapper.updateListSongMsg(listSong) >0 ?true:false;
    }

    public boolean deleteListSong(Integer songId) {
        return listSongMapper.deleteListSong(songId) >0 ?true:false;
    }

    public boolean addListSong(ListSong listSong)
    {
        return listSongMapper.insertSelective(listSong) > 0?true:false;
    }

    public List<ListSong> listSongOfSongId(Integer songListId)
    {
        return listSongMapper.listSongOfSongId(songListId);
    }

}
