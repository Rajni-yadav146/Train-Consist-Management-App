import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoodsBogieTest {

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie bogie = new GoodsBogie(BogieShape.CYLINDRICAL);
        bogie.assignCargo(CargoType.PETROLEUM);
        assertEquals(CargoType.PETROLEUM, bogie.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie bogie = new GoodsBogie(BogieShape.RECTANGULAR);
        bogie.assignCargo(CargoType.PETROLEUM);
        assertNull(bogie.getCargo());
    }
}
