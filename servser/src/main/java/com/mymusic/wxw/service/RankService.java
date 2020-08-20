package com.mymusic.wxw.service;


import com.mymusic.wxw.model.Rank;

public interface RankService {

    int rankOfSongListId(Long songListId);

    boolean addRank(Rank rank);
}
