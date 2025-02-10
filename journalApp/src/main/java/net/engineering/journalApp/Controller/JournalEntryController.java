package net.engineering.journalApp.Controller;
import net.engineering.journalApp.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
    public class JournalEntryController  {

        private Map<Long,JournalEntry> journalEntries = new HashMap<>();

        @GetMapping
        public List<JournalEntry> getAll(){
            return new ArrayList<>(journalEntries.values());
        }
// returning the values we inserted

        @PostMapping
        public boolean create(@RequestBody JournalEntry myEntry){
            journalEntries.put(myEntry.getId(),myEntry);
            return true;
        }
        //posting values
    //requestbody = just like calling spring to take the data and create object of this so that we can use

        @GetMapping("id/{myId}")
            public JournalEntry getJournalEntryById(@PathVariable long myId){
                return journalEntries.get(myId);
        }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
            return journalEntries.remove(myId);
    }

@PutMapping("id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable long id,@RequestBody JournalEntry myEntry){
return journalEntries.put(id,myEntry);
}

}
