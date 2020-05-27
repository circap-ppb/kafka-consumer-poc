package com.flutter.smf.cbb.kafkapoc.model.mapper;

import com.flutter.smf.se.bb.game.contract.Game;

public class GameMapper {

    public static Game toproto(com.flutter.smf.cbb.kafkapoc.model.Game game){
        Game build = Game.newBuilder().setId("1").build();
        return null;
    }
}
