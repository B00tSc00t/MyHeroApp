package com.example.myheroapp;

public class Api {

    private static final String ROOT_URL = "http://192.168.193.178/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createHero";
    public static final String URL_READ_HERO = ROOT_URL + "readhero";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";
}