package com.shadow.view;

import com.shadow.model.Attribute;
import com.shadow.model.Attributes;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.List;

/**
 * Created by felix on 05.02.18.
 */
public class FXController {

    public static GridPane createAttributeTable(Attributes attributes){
        Text texts[] = new Text[6];
        texts[0] = new Text("Attributes");
        texts[1] = new Text("Base");
        texts[2] = new Text("(Aug)");
        texts[3] = new Text("");
        texts[4] = new Text("Metatype");
        texts[5] = new Text("Limits");
        GridPane gridPane = new GridPane();
        for(int i = 0;i < 5;i++) {
            gridPane.add(texts[i], i, 0);
        }
        List<Attribute> attrs = attributes.toList();
        int j = 1;
        while (!attrs.isEmpty()){
            Attribute attr = attrs.get(0);
            attrs.remove(0);
            texts = new Text[6];
            texts[0] = new Text(attr.getName());
            texts[1] = new Text(String.valueOf(attr.getValue()));
            texts[2] = new Text("");
            texts[3] = new Text("");
            texts[4] = new Text(String.valueOf(attr.getMetatypemin()) +"/"+ String.valueOf(attr.getMetatypemax()));
            texts[5] = new Text(String.valueOf(attr.getTotalvalue()));
            for(int i = 0;i < 5;i++) {
                gridPane.add(texts[i], i, j);
            }
        }
        return gridPane;
    }

    public static Scene changeAttributes(Scene scene, Attributes attributes){
        GridPane gridPane = createAttributeTable(attributes);
        GridPane old = (GridPane)scene.lookup("#attribute_table");
        old = gridPane;
        return scene;
    }
}
