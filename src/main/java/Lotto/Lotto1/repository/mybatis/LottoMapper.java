package Lotto.Lotto1.repository.mybatis;

import Lotto.Lotto1.domain.LottoDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LottoMapper {

    void save(LottoDomain lottoDomain);
}
