package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "The kata starter project")
public class KataStarterProjectTest {

    @Test
    @DisplayName("should return its name")
    public void returnProjectName() {
        final KataStarterProject project = new KataStarterProject();

        final String projectName = project.getName();

        assertThat(projectName, is("Kata Starter Project"));
    }
}
