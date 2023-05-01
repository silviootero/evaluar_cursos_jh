package com.udea.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.udea.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class TotalScoreCourseTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(TotalScoreCourse.class);
        TotalScoreCourse totalScoreCourse1 = new TotalScoreCourse();
        totalScoreCourse1.setId(1L);
        TotalScoreCourse totalScoreCourse2 = new TotalScoreCourse();
        totalScoreCourse2.setId(totalScoreCourse1.getId());
        assertThat(totalScoreCourse1).isEqualTo(totalScoreCourse2);
        totalScoreCourse2.setId(2L);
        assertThat(totalScoreCourse1).isNotEqualTo(totalScoreCourse2);
        totalScoreCourse1.setId(null);
        assertThat(totalScoreCourse1).isNotEqualTo(totalScoreCourse2);
    }
}
