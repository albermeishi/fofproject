package com.fof.common.standard;

import com.fof.common.bean.PageModel;

import java.util.List;

public interface Page<T, S> extends GetCountByExample<S> {

    List<T> findByPage(PageModel<S> model);
}
