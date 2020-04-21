package rysich.springframework.spring5recipeapp.converters;

import org.junit.Before;
import org.junit.Test;
import rysich.springframework.spring5recipeapp.commands.CategoryCommand;
import rysich.springframework.spring5recipeapp.domain.Category;

import static org.junit.Assert.*;

public class CategoryCommandToCategoryTest {

    private static final Long ID = 1L;
    private static final String DESCRIPTION = "description";

    CategoryCommandToCategory converter;


    @Before
    public void setUp() throws Exception {
        converter = new CategoryCommandToCategory();
    }

    @Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new CategoryCommand()));
    }


    @Test
    public void convert() {
        //given
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID);
        categoryCommand.setDescription(DESCRIPTION);

        //when
        Category category = converter.convert(categoryCommand);

        //then
        assertEquals(category.getId(), categoryCommand.getId());
        assertEquals(category.getDescription(), categoryCommand.getDescription());

    }
}