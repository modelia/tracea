package edu.uoc.som.orchestrus.tracemodel;

import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactType;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;
import edu.uoc.som.orchestrus.tracemodel.typing.LinkType;

public class TestingTracemodel {

	public static void main(String[] args) {
		System.out.println("    --  o· o - O ~ o - o ~ o · O ·--");
		System.out.println("    --                            --");
		System.out.println("    -- --      Orchestrus      -- --");
		System.out.println("    --    ----            ----    --");
		System.out.println("    --------------------------------\n");
		
		testClosure();
		
		System.out.println("\n\n-- Safe Exit o·~ !¡");
	}
	
	public static void testClosure() {
		System.out.println("TestingTracemodel.testClosure()");
//		LinkTypeFactory ltFactory = LinkTypeFactory.getInstance();
		
		
		Trace t = new Trace("TestClosure");
		
		ArtefactType typeCode    = ArtefactTypeFactory.getType("CodeType");
		ArtefactType typeDesign  = ArtefactTypeFactory.getType("DesignType");
		ArtefactType typePalette = ArtefactTypeFactory.getType("PaletteType");
		ArtefactType typeEltType = ArtefactTypeFactory.getType("ETCType");
		
		
		/*
		 * Artefacts declaration 
		 */
		Artefact[] as = new Artefact[9];
		as[0] = new Artefact("a0", typeDesign);
		as[1] = new Artefact("a1", typeDesign);
		as[2] = new Artefact("a2", typeDesign);
		as[3] = new Artefact("a3", typeCode);
		as[4] = new Artefact("a4", typeCode);
		as[5] = new Artefact("a5", typePalette);
		as[6] = new Artefact("a6", typePalette);
		as[7] = new Artefact("a7", typeEltType);
		as[8] = new Artefact("a8", typeEltType);
		
		/*
		 * Fragment simulation ( 1 fragment for each artefact)
		 * TODO Name vs Definition vs Label. Attention !
		 */
		Artefact[] afs = new Artefact[9];
		for (int i = 0; i < as.length; i++) {
			afs[i] = new Artefact( as[i].getName()+"_FRAG", as[i].getType(), null, as[i]);
		}
		
		
		/*
		 * Link types from design to code and palette and EltTypeConfig + internal c2c: code to code.
		 */
		LinkType d2c = LinkType.getType("Design2Code");
		LinkType d2p = LinkType.getType("Design2Palette");
		LinkType p2c = LinkType.getType("Palette2Code");
		LinkType c2et = LinkType.getType("Code2EltType");
		LinkType c2c = LinkType.getType("Code2");
		LinkType p2p = LinkType.getType("Palette2");
		LinkType et2et = LinkType.getType("EltType2");
		
		/*
		 * Actual trace : 
		 * src - name - tgt - type
		 *  0  -  l1  -  3  -  d2c
		 *  1  -  l2  -  5  -  d2p
		 *  2  -  l3  -  5  -  d2p
		 *  5  -  l4  -  6  -  p2p
		 *  3  -  l5  -  4  -  c2c
		 *  6  -  l6  -  4  -  p2c
		 *  4  -  l7  -  7  -  c2et
		 *  7  -  l8  -  8  -  et2et
		 */
		TraceLink l1 = new TraceLink("l1", d2c);
		TraceLink l2 = new TraceLink("l2", d2p);
		TraceLink l3 = new TraceLink("l3", d2p);
		l1.setEnds(afs[0], afs[3]);
		l2.setEnds(afs[1], afs[5]);
		l3.setEnds(afs[2], afs[5]);
		
		TraceLink l4 = new TraceLink("l4", p2p);
		l4.setEnds(afs[5], afs[6]);
		
		TraceLink l5 = new TraceLink("l5", c2c);
		l5.setEnds(afs[3], afs[4]);

		TraceLink l6 = new TraceLink("l6", p2c);
		l6.setEnds(afs[6], afs[4]);

		TraceLink l7 = new TraceLink("l7", c2et);
		TraceLink l8 = new TraceLink("l8", et2et);
		l7.setEnds(afs[4], afs[7]);
		l8.setEnds(afs[7], afs[8]);
		

		t.addTraceLink(l1);
		t.addTraceLink(l2);
		t.addTraceLink(l3);
//		System.out.println("Closure of l1: (" +  l1.getClosure().size() + "/3) " + l1.getClosure());
		System.out.println("Closure of t: (" +  t.getTraceLinks().size() + "/8) " + t.getTraceLinks());
		
		System.out.println(t.renderTraceaJSon());
		
		
		//TODO load from json and assert elements count.
		
	}
	
	public void testTrace_1() {
		Trace t = new Trace("TestTrace");
		
		ArtefactType atCode = ArtefactTypeFactory.getType("Code");
		ArtefactType atDesign = ArtefactTypeFactory.getType("Design");
		
		
		Artefact artCode1 = new Artefact("artCode1", atCode);
		Artefact artCode2 = new Artefact("artCode2", atCode);
		Artefact artDesg1 = new Artefact("artDesg1", atDesign);
		
		Artefact afCode1_1 = new Artefact("afCode1_1", atCode,   null, artCode1);
		Artefact afCode1_2 = new Artefact("afCode1_2", atCode,   null, artCode1);
		Artefact afCode2_1 = new Artefact("afCode2_1", atCode,   null, artCode2);
		Artefact afDesg1_1 = new Artefact("afDesg1_1", atDesign, null, artDesg1);
		
		LinkType ltD2C = LinkType.getType("Design2Code");
		
		TraceLink tl1 = new TraceLink("Link1", ltD2C);
		tl1.addSource(afCode1_1);
		tl1.addSource(afCode1_2);
		tl1.addSource(afCode2_1);
			tl1.addSource(afDesg1_1);
		
		System.out.println(t.renderTraceaJSon());

	}

}
