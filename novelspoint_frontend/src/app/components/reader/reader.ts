import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

@Component({
  selector: 'app-reader',
  imports: [BrowserModule, FormsModule],
  templateUrl: './reader.html',
  styleUrl: './reader.scss'
})
export class Reader {
  font = 18;
  night = false;
  chapter = { title: 'Chapter 1', content: '<p>Sample content...</p>' };

  increase() {this.font += 2};
  decrease() {this.font = Math.max(12, this.font - 2); }
  
}
