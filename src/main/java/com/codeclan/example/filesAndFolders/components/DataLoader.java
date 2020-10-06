package com.codeclan.example.filesAndFolders.components;

import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.models.FileType;
import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import com.codeclan.example.filesAndFolders.repositories.FileRepository;
import com.codeclan.example.filesAndFolders.repositories.FolderRepository;
import com.codeclan.example.filesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }
    public void run(ApplicationArguments args){
        User user1 = new User("Jack");
        userRepository.save(user1);
        User user2 = new User("Nina");
        userRepository.save(user2);
        User user3 = new User("Tony");
        userRepository.save(user3);

        Folder folder1 = new Folder("Hidden",user2);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Jack's Official CTU stuff",user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Nina's Official CTU stuff",user2);
        folderRepository.save(folder3);
        Folder folder4 = new Folder("Jacks family stuff",user1);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("Tony's Official CTU stuff",user3);
        folderRepository.save(folder5);
        Folder folder6 = new Folder("Hidden",user3);
        folderRepository.save(folder6);


        File file1 = new File("CTU secrets", FileType.TXT,folder1);
        fileRepository.save(file1);
        File file2 = new File("CTU agent list", FileType.RTF,folder1);
        fileRepository.save(file2);
        File file3 = new File("CTU layout", FileType.PPT,folder1);
        fileRepository.save(file3);

        File file4 = new File("CTU Teams", FileType.RB,folder2);
        fileRepository.save(file4);
        File file5 = new File("CTU Operations", FileType.PPT,folder2);
        fileRepository.save(file5);
        File file6 = new File("Suspects", FileType.PPT,folder3);
        fileRepository.save(file6);
        File file7 = new File("Interrogations", FileType.PPT,folder3);
        fileRepository.save(file7);
        File file8 = new File("SafeHouses", FileType.MD,folder5);
        fileRepository.save(file8);
        File file9 = new File("Tonys Java fun", FileType.JAVA, folder5);
        fileRepository.save(file9);
        File file10 = new File("Tonys Ruby fun", FileType.RB,folder6);
        fileRepository.save(file10);
        File file11 = new File("Undercover Stuff", FileType.PDF,folder6);
        fileRepository.save(file11);


    }

}
