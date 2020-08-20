package com.mymusic.wxw.service.impl;


import com.mymusic.wxw.dao.SongListMapper;
import com.mymusic.wxw.model.SongList;
import com.mymusic.wxw.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    private SongListMapper songListMapper;

    public boolean updateSongListMsg(SongList songList) {
        return songListMapper.updateSongListMsg(songList) >0 ?true:false;
    }

    public boolean deleteSongList(Integer id) {
        return songListMapper.deleteSongList(id) >0 ?true:false;
    }

    public List<SongList> allSongList()
    {
        return songListMapper.allSongList();
    }

    public List<SongList> likeTitle(String title)
    {
        return songListMapper.likeTitle(title);
    }

    public List<SongList> likeStyle(String style)
    {
        return songListMapper.likeStyle(style);
    }

    public List<SongList> songListOfTitle(String title)
    {
        return songListMapper.songListOfTitle(title);
    }

    public boolean addSongList(SongList songList)
    {
        return songListMapper.insertSelective(songList) > 0?true:false;
    }

    public boolean updateSongListImg(SongList songList) {

        return songListMapper.updateSongListImg(songList) >0 ?true:false;
    }
}
