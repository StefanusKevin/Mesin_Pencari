/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stefanus Kevin 165314060
 */
public class TableModelDokumen extends AbstractTableModel {

    private List<SearchingResult> doc = new ArrayList<SearchingResult>();

    public TableModelDokumen(List<SearchingResult> doc) {
        this.doc = doc;
    }

    @Override
    public int getRowCount() {
        return doc.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SearchingResult b = doc.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getDocument().getId();
            case 1:
                return b.getDocument().getTitle();
            case 2:
                return b.getDocument().getContent();
            case 3:
                return b.getSimilarity();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Dokumen";
            case 1:
                return "Judul";
            case 2:
                return "Isi";
            case 3:
                return "Cosine Similarity";
            default:
                return "";
        }
    }
}
