package org.ehrbase.serialisation.jsonencoding;

import com.nedap.archie.rm.datastructures.Element;
import com.nedap.archie.rm.datastructures.ItemTree;
import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import com.nedap.archie.rm.datavalues.quantity.datetime.DvDate;
import com.nedap.archie.rm.datavalues.quantity.datetime.DvDateTime;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertNotNull;

public class CanonicalJsonMarshallingTest {

    @Test
    public void UnmarshalMultimedia() throws IOException {

        String value = new String(Files.readAllBytes(Paths.get("src/test/resources/sample_data/multimedia.json")));

        CanonicalJson cut = new CanonicalJson();
        DvMultimedia dvMultimedia = cut.unmarshal(value, DvMultimedia.class);

        assertNotNull(dvMultimedia);
    }

    @Test
    public void UnmarshalMultimediaElement() throws IOException {

        String value = new String(Files.readAllBytes(Paths.get("src/test/resources/sample_data/element_multimedia.json")));

        CanonicalJson cut = new CanonicalJson();
        Element element = cut.unmarshal(value, Element.class);

        assertNotNull(element);
    }

    @Test
    public void UnmarshalItemTree() throws IOException {

        String value = new String(Files.readAllBytes(Paths.get("src/test/resources/sample_data/item_tree_with_multimedia.json")));

        CanonicalJson cut = new CanonicalJson();
        ItemTree itemTree = cut.unmarshal(value, ItemTree.class);

        assertNotNull(itemTree);
    }

    @Test
    public void UnmarshalPartialDate() throws IOException {

        String value = new String(Files.readAllBytes(Paths.get("src/test/resources/sample_data/partialdvdate.json")));

        CanonicalJson cut = new CanonicalJson();
        DvDate dvDate = cut.unmarshal(value, DvDate.class);

        assertNotNull(dvDate);
    }

    @Test
    public void UnmarshalPartialDateTime() throws IOException {

        String value = new String(Files.readAllBytes(Paths.get("src/test/resources/sample_data/partialdvdatetime.json")));

        CanonicalJson cut = new CanonicalJson();
        DvDateTime dvDateTime = cut.unmarshal(value, DvDateTime.class);

        assertNotNull(dvDateTime);
    }
}
