package teste;

import ro.ase.cts.categoriiTeste.TestGetPromovabilitate;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestGrupaWithMocks.class,TestGrupa.class})
@Categories.IncludeCategory(TestGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
