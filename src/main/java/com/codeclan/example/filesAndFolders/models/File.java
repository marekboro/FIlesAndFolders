package com.codeclan.example.filesAndFolders.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "files")
public class File implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private FileType extension;

//    @JsonIgnoreProperties({"files"})  // we could use instead !!! !!!     : @JsonBackReference
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name ="folder_id", nullable = false)
    private Folder folder;

    public File(String name, FileType extension, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.folder = folder;
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileType getExtension() {
        return extension;
    }

    public void setExtension(FileType extension) {
        this.extension = extension;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
