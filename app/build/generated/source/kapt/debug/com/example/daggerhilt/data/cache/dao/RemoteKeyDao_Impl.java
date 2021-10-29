package com.example.daggerhilt.data.cache.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.daggerhilt.data.cache.models.RemoteKeyDb;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RemoteKeyDao_Impl implements RemoteKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RemoteKeyDb> __insertionAdapterOfRemoteKeyDb;

  private final SharedSQLiteStatement __preparedStmtOfClearRemoteKeys;

  public RemoteKeyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRemoteKeyDb = new EntityInsertionAdapter<RemoteKeyDb>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `remote_keys` (`characterId`,`prevKey`,`nextKey`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RemoteKeyDb value) {
        stmt.bindLong(1, value.getCharacterId());
        if (value.getPrevKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPrevKey());
        }
        if (value.getNextKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getNextKey());
        }
      }
    };
    this.__preparedStmtOfClearRemoteKeys = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM remote_keys";
        return _query;
      }
    };
  }

  @Override
  public void insertRemoteKeys(final List<RemoteKeyDb> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRemoteKeyDb.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearRemoteKeys() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearRemoteKeys.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearRemoteKeys.release(_stmt);
    }
  }

  @Override
  public RemoteKeyDb fetchRemoteKey(final int id) {
    final String _sql = "SELECT * FROM remote_keys WHERE characterId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCharacterId = CursorUtil.getColumnIndexOrThrow(_cursor, "characterId");
      final int _cursorIndexOfPrevKey = CursorUtil.getColumnIndexOrThrow(_cursor, "prevKey");
      final int _cursorIndexOfNextKey = CursorUtil.getColumnIndexOrThrow(_cursor, "nextKey");
      final RemoteKeyDb _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCharacterId;
        _tmpCharacterId = _cursor.getInt(_cursorIndexOfCharacterId);
        final Integer _tmpPrevKey;
        if (_cursor.isNull(_cursorIndexOfPrevKey)) {
          _tmpPrevKey = null;
        } else {
          _tmpPrevKey = _cursor.getInt(_cursorIndexOfPrevKey);
        }
        final Integer _tmpNextKey;
        if (_cursor.isNull(_cursorIndexOfNextKey)) {
          _tmpNextKey = null;
        } else {
          _tmpNextKey = _cursor.getInt(_cursorIndexOfNextKey);
        }
        _result = new RemoteKeyDb(_tmpCharacterId,_tmpPrevKey,_tmpNextKey);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
