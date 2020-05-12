package net.mikasa.mikasaweb.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.mikasa.mikasaweb.model.Plan;
import net.mikasa.mikasaweb.dao.PlanDAO;

@SpringBootTest
public class PlanServiceTest {

  private static Plan planFixture;
  private static List<Plan> lPlanFixture = new LinkedList<Plan>();


  @Autowired
  private PlanService planService;

  @MockBean
  private PlanDAO planDAO;

  @BeforeAll
  public static void setUp() {
    planFixture = new Plan("dummy name", "dummy type");
    lPlanFixture.add(new Plan("dummy name", "dummy type"));
    lPlanFixture.add(new Plan("another dummy name", "another dummy type"));
  }

  @Test
  public void testFindByName() {
    Mockito.when(planDAO.findByName("dummy name")).thenReturn(planFixture);
    Plan plan = planService.findByName("dummy name");
    assertThat(plan.getPlantype()).isEqualTo("dummy type");
  }

  @Test
  public void testFindAll() {
    Mockito.when(planDAO.findAll()).thenReturn(lPlanFixture);

    List<Plan> lPlans = planService.findAll();
    assertThat(lPlans.size()).isEqualTo(2);

  }

}
