package com.example.testandroid1502;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.testandroid1502.databinding.ActivityMainBinding;
import com.example.testandroid1502.domain.Person;
import com.example.testandroid1502.domain.Pet;
import com.example.testandroid1502.list.PersonAdapter;
import com.example.testandroid1502.recycler.PetAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<Person> people;

    private List<Pet> pets;
    private List<Pet> firstPetList;

    private List<Pet> secondPetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initPets();
        initPeople();

        PersonAdapter personAdapter = new PersonAdapter(this, people);
        PetAdapter petAdapter = new PetAdapter(pets);
        binding.lvPerson.setAdapter(personAdapter);
        binding.rvPets.setAdapter(petAdapter);
    }

    private void initPeople() {
        people = new ArrayList<>();
        people.add(new Person(1, "Sara", "+7 976 544 46 32", firstPetList));
        people.add(new Person(2, "John", "+7 945 678 56 72", secondPetList));
    }

    private void initPets() {
        firstPetList = new ArrayList<>();
        firstPetList.add(new Pet("Potato", "cat", "Cat"));

        secondPetList = new ArrayList<>();
        secondPetList.add(new Pet("Anteater", "dog", "Dog"));

        pets = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            for (int j = 0; j < person.getPets().size(); j++) {
                Pet pet = person.getPets().get(j);
                pets.add(pet);
            }
        }

    }
}