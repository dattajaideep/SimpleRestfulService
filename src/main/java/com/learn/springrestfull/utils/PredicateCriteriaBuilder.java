package com.learn.springrestfull.utils;

import com.learn.springrestfull.bean.SearchCriteria;
import com.learn.springrestfull.entity.OnePieceCharacter;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PredicateCriteriaBuilder implements Specification<OnePieceCharacter> {
    private final List<SearchCriteria> list;

    public PredicateCriteriaBuilder(List<SearchCriteria> list) {
        this.list = list;
    }
    public void add(SearchCriteria criteria) {
        list.add(criteria);
    }

}
