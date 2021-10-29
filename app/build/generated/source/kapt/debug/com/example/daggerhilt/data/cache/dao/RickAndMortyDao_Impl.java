package com.example.daggerhilt.data.cache.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.daggerhilt.data.cache.models.RickAndMortyCacheModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RickAndMortyDao_Impl implements RickAndMortyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RickAndMortyCacheModel> __insertionAdapterOfRickAndMortyCacheModel;

  private final SharedSQLiteStatement __preparedStmtOfClearCache;

  public RickAndMortyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRickAndMortyCacheModel = new EntityInsertionAdapter<RickAndMortyCacheModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `rick_and_morty` (`id`,`name`,`status`,`gender`,`location`,`image`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RickAndMortyCacheModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStatus());
        }
        if (value.getGender() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGender());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLocation());
        }
        if (value.getImage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImage());
        }
      }
    };
    this.__preparedStmtOfClearCache = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM rick_and_morty";
        return _query;
      }
    };
  }

  @Override
  public Object addRickAndMortyData(final List<RickAndMortyCacheModel> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRickAndMortyCacheModel.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearCache(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCache.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearCache.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, RickAndMortyCacheModel> fetchRickAndMortyData() {
    final String _sql = "SELECT * FROM rick_and_morty";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, RickAndMortyCacheModel>() {
      @Override
      public LimitOffsetDataSource<RickAndMortyCacheModel> create() {
        return new LimitOffsetDataSource<RickAndMortyCacheModel>(__db, _statement, false, false , "rick_and_morty") {
          @Override
          protected List<RickAndMortyCacheModel> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
            final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(cursor, "gender");
            final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(cursor, "location");
            final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(cursor, "image");
            final List<RickAndMortyCacheModel> _res = new ArrayList<RickAndMortyCacheModel>(cursor.getCount());
            while(cursor.moveToNext()) {
              final RickAndMortyCacheModel _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              final String _tmpStatus;
              if (cursor.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = cursor.getString(_cursorIndexOfStatus);
              }
              final String _tmpGender;
              if (cursor.isNull(_cursorIndexOfGender)) {
                _tmpGender = null;
              } else {
                _tmpGender = cursor.getString(_cursorIndexOfGender);
              }
              final String _tmpLocation;
              if (cursor.isNull(_cursorIndexOfLocation)) {
                _tmpLocation = null;
              } else {
                _tmpLocation = cursor.getString(_cursorIndexOfLocation);
              }
              final String _tmpImage;
              if (cursor.isNull(_cursorIndexOfImage)) {
                _tmpImage = null;
              } else {
                _tmpImage = cursor.getString(_cursorIndexOfImage);
              }
              _item = new RickAndMortyCacheModel(_tmpId,_tmpName,_tmpStatus,_tmpGender,_tmpLocation,_tmpImage);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
