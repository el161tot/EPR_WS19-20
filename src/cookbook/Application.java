package cookbook;

public class Application {

	public static void main(String[] args) {
		Ingredient salz = new Ingredient("Salz", "Gewuerz");
		Ingredient pfeffer = new Ingredient("Pfeffer", "Gewuerz");

		Ingredient olivenoel = new Ingredient("Olivenoel", "Öl");
		Ingredient pinienkerne = new Ingredient("Pinienkerne", "Nuss");
		Ingredient rucola = new Ingredient("Rucola", "Gemuese");
		Ingredient kirschtomate = new Ingredient("Kirschtomate", "Gemuese");
		Ingredient honig = new Ingredient("Honig", "Suess");
		Ingredient birne = new Ingredient("Birne", "Obst");
		Ingredient butter = new Ingredient("Butter", "Öl");
		Ingredient ziegenkaese = new Ingredient("Ziegenkaese", "Milchprodukt");
		Ingredient weissweinessig = new Ingredient("Weissweinessig", "Essig");
		Ingredient[] zutatenRucolasalat = { olivenoel, pinienkerne, rucola, kirschtomate, honig, birne, butter,
				ziegenkaese, weissweinessig, salz, pfeffer };
		String anweisungRucolasalat = "Den Ofen auf 200 Grad vorheizen.\n"
				+ "Die Pinienkerne in einer Pfanne fettfrei roesten. Den Rucola-Salat waschen und mit den Pinienkernen auf Tellern anrichten. "
				+ "Die Cocktailtomaten in Scheiben schneiden und auf dem Salat verteilen.\n"
				+ "Die Birne und den Ziegenkaese in ca. 1 cm dicke, gleich grosse Scheiben schneiden. Eine Auflaufform fetten und die Birnen, "
				+ "mit jeweils einer Scheibe Ziegenkaese obendrauf, hineingeben. 15 - 20 Minuten ueberbacken, bis der Kaese goldgelb ist. "
				+ "Die Ziegenkaese-Birnen-Taler auf den Salat geben.\n"
				+ "Aus Olivenoel, Balsamico, Salz, Pfeffer und Honig ein Dressing anruehren. Dieses ueber den Salat traeufeln und servieren.";
		Recipe rucolaSalat = new Recipe("Rucola-Salat mit Ziegenkaese", "Vorspeise", zutatenRucolasalat,
				anweisungRucolasalat);

		Ingredient apfel = new Ingredient("Apfel", "Obst");
		Ingredient zwiebel = new Ingredient("Zwiebel", "Gemuese");
		Ingredient thymian = new Ingredient("Thymian", "Gewuerz");
		Ingredient gans = new Ingredient("Gans", "Fleisch");
		Ingredient[] zutatenGans = { apfel, zwiebel, thymian, gans, salz };
		String anweisungGans = "1. Die Gans von innen und aussen waschen und abtrocknen. Den Hals und"
				+ "die Fluegel entfernen und fuer die Sauce aufbewahren. \n"
				+ "2. Aepfel und Zwiebeln mit Thymian und wenig Salz vermischen. Die Gans " + "damit fuellen. \n"
				+ "3. Zum Schmoren die geviertelten Aepfel und Zwiebeln mit den halbierten "
				+ "Zwiebeln, Hals und Fluegeln in einen grossen Braeter geben. \n"
				+ "4. Die Gans von aussen mit Salz wuerzen, in einen Braeter mit der Brust "
				+ "nach unten legen, mit einer Tasse kaltem Wasser angiessen und auf "
				+ "der unteren Schiene des auf 150 Grad vorgeheizten Ofens schieben. "
				+ "5. Den Vogel ca. 2 ¾ - 3 ¼ Stunden garen und dabei immer mit dem "
				+ "austretendem Fett begiessen. Die Gans nach ca. 2 ¼ Stunden auf den Ruecken " + "legen. \n"
				+ "6. Wenn die Gans gar ist wird sie mit "
				+ "der Brustseite nach oben auf ein Gitter gelegt, waehrend sie den Ofen\n"
				+ "auf 230 Grad hochheizen. Ist die gewuenschte Temperatur erreicht, die "
				+ "Gans in den Ofen schieben und rund herum knusprig braten.";
		Recipe weihnachtsGans = new Recipe("Weihnachtsgans", "Hauptspeise", zutatenGans, anweisungGans);

		Ingredient kartoffel = new Ingredient("Kartoffel", "Gemuese");
		Ingredient gaensefett = new Ingredient("Gaensefett", "Öl");
		Ingredient knoblauch = new Ingredient("Knoblauch", "Gemuese");
		Ingredient salbei = new Ingredient("Salbei", "Gewuerz");
		Ingredient[] zutatenOfenkartoffeln = { kartoffel, gaensefett, knoblauch, salbei, salz, pfeffer };
		String anweisungOfenkartoffeln = "1. Die Kartoffeln schaelen und zehn Minuten in Salzwasser kochen.\n"
				+ "2. Abgiessen und gut schuetteln; die Aussenseiten der Kartoffeln duerfen nicht glatt bleiben.\n"
				+ "3. Den Boden der Backform gut einfetten. Das Fett muss auf dem Boden stehen.\n"
				+ "4. Die Kartoffeln in einer Schicht in die Form geben, salzen, pfeffern, Knoblauch und Salbei hinzugeben und bei 190 �C 30 Minuten backen.\n"
				+ "5. Die Form herausnehmen und auf einer hitzebestaendigen Unterlage abstellen.\n"
				+ "6. Mit dem Kartoffelstampfer und leichtem Druck von oben auf die Kartoffeln einwirken, so dass sie plan auf dem Boden zu liegen kommen. "
				+ "Die Seiten der Kartoffeln duerfen leicht einreissen.\n"
				+ "7. Die Knoblauchzehen (ungepellt) und die Kraeuter auf den Kartoffeln verteilen.\n"
				+ "8. Weitere 30 Minuten oder bis sie fertig aussehen, backen.";
		Recipe ofenkartoffeln = new Recipe("Ofenkartoffeln", "Hauptspeise", zutatenOfenkartoffeln,
				anweisungOfenkartoffeln);

		Ingredient balsamico = new Ingredient("Balsamico", "Essig");
		Ingredient bacon = new Ingredient("Bacon", "Fleisch");
		Ingredient fenchelsamen = new Ingredient("Fenchelsamen", "Gewuerz");
		Ingredient tafelapfel = new Ingredient("Tafelapfel", "Obst");
		Ingredient rotkohl = new Ingredient("Rotkohl", "Gemuese");
		Ingredient[] zutatenApfelRotkohl = { olivenoel, butter, bacon, fenchelsamen, tafelapfel, rotkohl, balsamico,
				zwiebel, salz, pfeffer };
		String anweisungApfelRotkohl = "1. In einem Topf 1 kraeftigen Schuss Olivenoel erhitzen und darin den Speck zusammen mit den Fenchelsamen goldbraun braten. \n"
				+ "2. Die Zwiebelscheiben hinzufuegen und im geschlossenen Topf einige Minuten duensten, "
				+ "bis sie goldgelb anlaufen und leicht karamellisieren. \n"
				+ "3. Die Aepfel dazugeben, gefolgt von den Kohlstuecken, " + "Salz und Pfeffer und dem Essig. \n"
				+ "4. Gruendlich umruehren, den Deckel wieder auflegen und den Rotkohl bei niedriger Temperatur "
				+ "1 Stunde schmoren, dabei ab und zu umruehren.";
		Recipe apfelRotkohl = new Recipe("Rotkohl", "Hauptspeise", zutatenApfelRotkohl, anweisungApfelRotkohl);

		Ingredient spekulatius = new Ingredient("Spekulatius", "Suess");
		Ingredient mascarpone = new Ingredient("Mascarpone", "Milchprodukt");
		Ingredient sahne = new Ingredient("Sahne", "Milchprodukt");
		Ingredient vanillezucker = new Ingredient("Vanillezucker", "Suess");
		Ingredient zucker = new Ingredient("Zucker", "Suess");
		Ingredient mandarine = new Ingredient("Mandarine", "Obst");
		Ingredient[] zutatenWeihnachtsTiramisu = { spekulatius, mascarpone, sahne, vanillezucker, zucker, mandarine };
		String anweisungWeihnachtsTiramisu = "1. Magerquark, Mascarpone, Schlagsahne, "
				+ "Vanillezucker und Zucker miteinander verruehren.\n"
				+ "2. Spekulatius zu kleinen Stuecken brechen und die Haelfte der Spekulatius in die Form geben. \n"
				+ "Je 3-4 Mandarinenstuecke auf die Spekulatius-Stuecke geben. "
				+ "Die Haelfte der Magerquark-Mascarponecreme in der Form verteilen. \n"
				+ "Mit einem Loeffel glattstreichen. \n"
				+ "3. Fuer die naechste Schicht restliche Spekulatius auf die Glaeser verteilen. \n"
				+ "Wieder 3-4 Mandarinen darauf geben und mit der restlichen Creme abschliessen. "
				+ "Die Creme nochmal glatt streichen und \n" + "jeweils 2-3 Mandarinen zur Deko oben drauf setzen. "
				+ "Bis zum Servieren kaltstellen.";
		Recipe weihnachtsTiramisu = new Recipe("Mandarine-Spekulatius-Tiramisu", "Dessert", zutatenWeihnachtsTiramisu,
				anweisungWeihnachtsTiramisu);

		Cookbook cookbook = new Cookbook("Weihnachtsessen", 5, "Alex Heckmann");
		Page page1 = new Page(1, rucolaSalat);
		Page page2 = new Page(2, apfelRotkohl);
		Page page3 = new Page(3, ofenkartoffeln);
		Page page4 = new Page(4, weihnachtsGans);
		Page page5 = new Page(5, weihnachtsTiramisu);
		Page[] pages = { page1, page2, page3, page4, page5 };
		for (int i = 0; i < pages.length; i++) {
			cookbook.addPage(pages[i]);
		}
	}
}
