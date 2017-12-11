package net.mikasa.mikasaweb.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.IndicatorType;

public class IndicatorTypeTest extends GenericTest {
  
  @Autowired
  IndicatorTypeDAO indicatorTypeDAO;
  
  @Test
  public void testFindAll() {
    List<IndicatorType>indicatorTypes = indicatorTypeDAO.findAll();
    assertThat(indicatorTypes.size()).isEqualTo(3);
  }

}
