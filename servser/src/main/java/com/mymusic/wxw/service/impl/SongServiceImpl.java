package com.mymusic.wxw.service.impl;


import com.mymusic.wxw.dao.SongMapper;
import com.mymusic.wxw.model.Song;
import com.mymusic.wxw.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    public List<Song> allSong()
    {
        return songMapper.allSong();
    }

    public boolean addSong(Song song)
    {

        return songMapper.insertSelective(song) > 0?true:false;
    }

    public boolean updateSongMsg(Song song) {
        return songMapper.updateSongMsg(song) >0 ?true:false;
    }

    public boolean updateSongUrl(Song song) {

        return songMapper.updateSongUrl(song) >0 ?true:false;
    }

    public boolean updateSongPic(Song song) {

        return songMapper.updateSongPic(song) >0 ?true:false;
    }

    public boolean deleteSong(Integer id) {
        return songMapper.deleteSong(id) >0 ?true:false;
    }

    public List<Song> songOfSingerId(Integer singerId)

    {
        return songMapper.songOfSingerId(singerId);
    }

    public List<Song> songOfId(Integer id)

    {
        return songMapper.songOfId(id);
    }

    public List<Song> songOfSingerName(String name)

    {
        return songMapper.songOfSingerName(name);
    }

    public List<Song> songOfName(String name)

    {
        return songMapper.songOfName(name);
    }
}
