package com.fof.common.standard;

import org.apache.ibatis.annotations.Param;

public interface GetCountByExample<S> {

    Integer getCount(@Param("search") S search);
}
