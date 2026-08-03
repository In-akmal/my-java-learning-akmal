<h2><a href="https://www.geeksforgeeks.org/problems/mind-game3637/1?page=3">Mind Game</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p data-start="0" data-end="90"><span style="font-size: 14pt;">A person randomly chooses a number between 1 and 10 and performs the following operations:</span></p>
<ol data-start="94" data-end="332">
<li data-section-id="194gduv" data-start="94" data-end="124"><span style="font-size: 14pt;"> Double the chosen number. </span></li>
<li data-section-id="b6huq7" data-start="126" data-end="206"><span style="font-size: 14pt;"> Add an even number <span class="katex"><span class="katex-mathml">k</span></span>&nbsp;(given as input) to the result obtained in Step 1. </span></li>
<li data-section-id="nz1p3e" data-start="208" data-end="248"><span style="font-size: 14pt;"> Divide the result from Step 2 by 2. </span></li>
<li data-section-id="ls80rv" data-start="250" data-end="332"><span style="font-size: 14pt;"> Subtract the original chosen number n&nbsp;from the result obtained in Step 3. </span></li>
</ol>
<p><span style="font-size: 14pt;"> </span></p>
<p data-start="336" data-end="429" data-is-last-node="" data-is-only-node=""><span style="font-size: 14pt;">Your task is to determine the final value obtained after performing all the above operations.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong><span style="font-size: 18px;">Input:</span> </strong>k</span><span style="font-size: 18px;"><strong> = </strong>10</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">5</span>
<span style="font-size: 18px;"><strong>Explanation:</strong></span>
<span style="font-size: 18px;">Suppose chosen number is 3, then after
Step 1: number = 6
Step 2: number = 6 + 10 = 16
Step 3: number = 16/2 = 8
Step 4: 8-3 = 5(required answer).</span>
<span style="font-size: 18px;">No matter what number Rohan chooses, the answer always comes to be 5.</span>
</pre>
<pre><span style="font-size: 18px;"><strong><span style="font-size: 18px;">Input:</span> </strong></span><span style="font-size: 18px;">k<strong> = </strong>2</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">1</span>
<span style="font-size: 18px;"><strong>Explanation:</strong></span>
<span style="font-size: 18px;">Suppose chosen number is 8, then after
Step 1: number = 16
Step 2: number = 16+2 = 18
Step 3: number = 18/2 = 9
Step 4: 9-8 = 1(required answer).</span>
<span style="font-size: 18px;">No matter what number Rohan chooses the answer always comes to be 1.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">2 ≤ k ≤ 10<sup>8</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;