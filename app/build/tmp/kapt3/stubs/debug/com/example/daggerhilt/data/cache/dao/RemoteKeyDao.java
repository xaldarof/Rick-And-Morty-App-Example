package com.example.daggerhilt.data.cache.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/daggerhilt/data/cache/dao/RemoteKeyDao;", "", "clearRemoteKeys", "", "fetchRemoteKey", "Lcom/example/daggerhilt/data/cache/models/RemoteKeyDb;", "id", "", "insertRemoteKeys", "list", "", "app_debug"})
public abstract interface RemoteKeyDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM remote_keys WHERE characterId=:id")
    public abstract com.example.daggerhilt.data.cache.models.RemoteKeyDb fetchRemoteKey(int id);
    
    @androidx.room.Insert()
    public abstract void insertRemoteKeys(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.daggerhilt.data.cache.models.RemoteKeyDb> list);
    
    @androidx.room.Query(value = "DELETE FROM remote_keys")
    public abstract void clearRemoteKeys();
}