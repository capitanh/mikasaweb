package net.mikasa.mikasaweb.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.Plan;

public class PlanDAOTest extends GenericTest {

  @Autowired
  PlanDAO planDAO;

  @Test
  public void testFindAll() {
    List<Plan>plans = planDAO.findAll();
    assertThat(plans.size()).isEqualTo(4);
  }

}
