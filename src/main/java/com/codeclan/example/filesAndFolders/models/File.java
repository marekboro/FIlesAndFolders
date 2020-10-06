package com.codeclan.example.filesAndFolders.models;

public class File {
    private Long id;
    private String name;
    private FileType extension;
    private Folder folder;

    public File(String name, FileType extension, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.folder = folder;
    }

    public File(Long id) {
        this.id = id;
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
